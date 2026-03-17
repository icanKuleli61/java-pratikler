package observer_youtube_system;

import java.util.ArrayList;
import java.util.List;

public  class YoutubeKanalSubject {

    private String kanalName;

    private List<String> videoNames = new ArrayList<>();

    List<Observer> observers = new ArrayList<>();


    public YoutubeKanalSubject(String kanalName){
        this.kanalName = kanalName;
    }

    public void registerObserver(Observer observer,User user){
        observers.add(observer);
        System.out.println(user.getName() +" Abone Oldu");
    }


    public void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    private List<Observer> getObservers(){
        return observers;
    }

    public void addVideoName(String videoName){
        videoNames.add(videoName);
        uptadeStateles(videoName,this.getKanalName());
    }

    public void removeVideoName(String videoName){
        videoNames.remove(videoName);
    }

    public void printVideoNames(){
        for(String videoName : videoNames){
            if (videoName == null){
                System.out.println("Kanal'da video mevcut değil.");
            }
            System.out.println(videoName);
        }
    }

    private void uptadeStateles(String videoName, String KanalName){
        for (Observer observer : observers){
            if (observer != null){
                observer.update(videoName,this.getKanalName());
            }
        }

    }
    public String getKanalName() {
        return kanalName;
    }




}
