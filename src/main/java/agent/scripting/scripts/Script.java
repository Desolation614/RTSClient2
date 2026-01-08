package agent.scripting.scripts;

public interface Script {
    void onStart();
    void onTick();
    void onStop();
}
