package DailyQuiz;

class Animal{
    private String name;
    private boolean sleepStatus;

    Animal(){
        this.name = "unknown";
        this.sleepStatus = false;
    }
    Animal(String name){
        this.name = name;
        this.sleepStatus = false;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void sleep() {
        this.sleepStatus = true;
    }
    public void wake() {
        this.sleepStatus = false;
    }
    public boolean isSleep() {
        return this.sleepStatus;
    }
}

public class DailyQuiz0310 {
    public static void main(String[] args) {
        Animal dog = new Animal("poppy");
        Animal lion = new Animal();

        System.out.println("개의 이름은 " + dog.getName());
        lion.setName("cat");
        System.out.println("사자의 이름은 " + lion.getName());
        lion.sleep();
        if (lion.isSleep()) {
            System.out.println(lion.getName() + "은 수면 중입니다.");
        } else {
            System.out.println(lion.getName() + "은 활동 중입니다.");
        }
        System.out.println("--------16시간 후-----------");
        lion.wake();
        if (lion.isSleep()) {
            System.out.println(lion.getName() + "은 수면 중입니다.");
        } else {
            System.out.println(lion.getName() + "은 활동 중입니다.");
        }
    }
}
