import java.util.ArrayList;
import java.util.List;

interface Observation {
    public void registerObserver(Observer obj);

    public void unRegister(Observer obj);

    public void notifyObservers();

    public Object getUpdate(Observer obj);
}

interface Observer {
    public void update();
}

class Topic implements Observation {
    private List<Observer> observers;
    private String message;

    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(Observer obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unRegister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::update); // 람다식에서의 forEach -observers list 내의 각 Observer 인스턴스의 update() 메서드를
                                                  // 실행함
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message sended to topic: " + msg);
        this.message = msg;
        notifyObservers();
    }
}

class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public TopicSubscriber(String name, Subject topic) {
        this.name = name;
        this.topic = topic;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this); // topic의 getUpdate()는 Observer를 매개변수로 받음 -
                                                     // TopicSubscriber는 Observer를 상속받은 클래스기 때문에 this를 사용하여 자기 자신을 매개변수로
                                                     // 넣어줄 수 있다
        System.out.println(this.name + ":: got message -> " + msg);

    }
}

public class ObserverEx {
    public static void main(String[] args) {
        Topic topic = new Topic();
        Observer obs1 = new TopicSubscriber("observer1", topic);
        Observer obs2 = new TopicSubscriber("observer2", topic);
        Observer obs3 = new TopicSubscriber("observer3", topic);

        topic.register(obs1);
        topic.register(obs2);
        topic.register(obs3);

        topic.postMessage("LOL");
    }
}

/*
 * Message sended to topic: LOL
 * observer1:: got message -> LOL
 * observer2:: got message -> LOL
 * observer3:: got message -> LOL
 */