public class PersonTest {
    public static void main(String[] args) {
        Person itai = new Person();

//        SoccerPlayer shivani = new Person(); //CE

        Athlete sohum = new SoccerPlayer();

        Person jack = new Athlete();

        Athlete anjali = new Athlete();

        SoccerPlayer chirasree = new SoccerPlayer();

        itai.watch(chirasree); // wow

//        jack.watch(sohum); // CE

        itai.speakTo(sohum); // kudos

        jack.speakTo(anjali); // kudos

        anjali.speakTo(chirasree); // take notes

        sohum.speakTo(itai); // hmph

        chirasree.speakTo((SoccerPlayer) sohum); // respect

//        sohum.watch(itai); // CE

//        sohum.watch((Athlete) itai); // RE

        ((Athlete) jack).speakTo(anjali); // take notes

//        ((SoccerPlayer) jack).speakTo(chirasree); // RE

        ((Person) chirasree).speakTo(itai); // hmph
    }
}
