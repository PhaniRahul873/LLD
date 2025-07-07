public interface VendingMachineState {
    // Get the name of the current state
    String getStateName();
    // Method to handle state transitions
    VendingMachineState next(VendingMachineContext context);
}