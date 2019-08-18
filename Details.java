package information;

 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;

 import java.util.List;


public class Details {
    public String date;
    public Double tweet_id;
    public String screen_name;
    public String created_at;
    public String tweet_text;
    private List<ClassifierInfo> classifier_info = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(Double tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTweet_text() {
        return tweet_text;
    }

    public void setTweet_text(String tweet_text) {
        this.tweet_text = tweet_text;
    }

    public List<ClassifierInfo> getClassifier_info() {
        return classifier_info;
    }

    public void setClassifier_Info(List<ClassifierInfo> classifier_info) {
        this.classifier_info = classifier_info;
    }





}