package FindMyTrain;

public class Train {
    private String trainID;
    private String trainName;
    private String type;

    public Train(String trainID, String trainName, String type) {
        this.trainID = trainID;
        this.trainName = trainName;
        this.type = type;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID='" + trainID + '\'' +
                ", trainName='" + trainName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
