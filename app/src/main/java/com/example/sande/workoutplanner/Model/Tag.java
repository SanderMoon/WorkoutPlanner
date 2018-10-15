package com.example.sande.workoutplanner.Model;

import android.support.annotation.NonNull;

public enum Tag {
    QUADS{
        @NonNull
        public String toString(){
            return "Quads";
        }
    },
    HAMSTRINGS{
        @NonNull
        public String toString(){
            return "Hamstrings";
        }
    },
    GLUTES{
        @NonNull
        public String toString(){
            return "Glutes";
        }
    },
    FRONTDELTS{
        @NonNull
        public String toString(){
            return "Front delts";
        }
    },
    SIDEREARDELTS{
        @NonNull
        public String toString(){
            return "Side/rear delts";
        }
    },
    BICEPS{
        @NonNull
        public String toString(){
            return "Biceps";
        }
    },
    TRICEPS{
        @NonNull
        public String toString(){
            return "Triceps";
        }
    },
    LOWERBACK{
        @NonNull
        public String toString(){
            return "Lower back";
        }
    },
    UPPERBACK{
        @NonNull
        public String toString(){
            return "Upper back";
        }
    },
    MIDDLEBACK{
        @NonNull
        public String toString(){
            return "Middle back";
        }
    },
    OBLIQUES{
        @NonNull
        public String toString(){
            return "Obliques";
        }
    },
    ABDOMINALS{
        @NonNull
        public String toString(){
            return "Abs";
        }
    },
    CHEST{
        @NonNull
        public String toString(){
            return "Chest";
        }
    }

}
