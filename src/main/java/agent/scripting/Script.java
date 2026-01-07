package agent.scripting;

public interface Script {
    void onStart();
    void onTick();
    void onStop();
}
