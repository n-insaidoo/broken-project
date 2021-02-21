package com.ninsaidoo;

public class SomeClass {

    public class FieldOnlyRead {
        private int deadField;

        private int getDeadField() {
            return deadField;
        }
    }

    /** This method is live because it is called by main(..) */
    public static void liveMethod() {
        otherLiveMethod();
    }

    /** This method is live because it is called by a liveMethod */
    public static void otherLiveMethod() {
    }


    /** This method is dead because it is never called */
    public static void deadMethod() {
        otherDeadMethod();
    }

    /** This method is dead because it is only called by a dead method */
    public static void otherDeadMethod() {
    }
    
	public static void main(String[] args) {
		System.out.println("Hello world");
	}
}
