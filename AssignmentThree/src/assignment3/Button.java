package assignment3;

public interface Button {
    float SIZE = 0.5f;
    String SHAPE = "Square";

    void tapButton(char button);

    void holdButton(int duration, char button);
}
