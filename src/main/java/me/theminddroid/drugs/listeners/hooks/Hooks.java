package main.java.me.theminddroid.drugs.hooks;

public class Hooks {
    @SuppressWarnings("unused")
    private static boolean authUsed = false;

    private static ItemsAdderHook ITEMS_ADDER_HOOK;

    public static void hook() {
        ITEMS_ADDER_HOOK = new ItemsAdderHook();

        setAuthUsed(AUTH_ME_HOOK.isOn() || NEX_AUTH_HOOK.isOn());
    }

    public static <T> boolean isHookEnabled(Hook<T> hook) {
        return hook != null && hook.isOn();
    }

    public static ItemsAdderHook getItemsAdderHook() {
        return ITEMS_ADDER_HOOK;
    }

}