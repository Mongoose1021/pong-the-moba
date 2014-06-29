package client;

public class CommandUpdate implements Comparable<CommandUpdate> {
    private int[] keys;
    private long timestamp;
    private long playerId;

    public CommandUpdate() {
        this.keys = new int[0];
        this.playerId = 0;
        this.timestamp = System.nanoTime();
    }

    public CommandUpdate(int[] keys, long playerId) {
        this.keys = keys;
        this.playerId = playerId;
        this.timestamp = System.nanoTime();
    }

    @Override
    public int compareTo(CommandUpdate other) {
        if (timestamp < other.getTimestamp()) {
            return -1;
        } else if (timestamp == other.getTimestamp()) {
            return 0;
        } else {
            return 1;
        }
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getPlayerId() {
        return playerId;
    }

    public int[] getKeys() {
        return keys;
    }
}
