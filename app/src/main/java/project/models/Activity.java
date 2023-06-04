package project.models;

public class Activity {

        private String activity;
        private String date;
        
        public Activity(String activity, String date) {
            this.activity = activity;
            this.date = date;
        }
    
        public String getActivity() {
            return activity;
        }
    
        public String getDate() {
            return date;
        }
    
}
