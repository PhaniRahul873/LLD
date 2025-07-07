public interface PlayerState {
    void hit(Player player, Shoe shoe);
    void stand(Player player);
    void leave(Player player);
}