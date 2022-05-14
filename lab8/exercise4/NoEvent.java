package lab8.exercise4;

class NoEvent extends Event{
	 
    NoEvent() {
        super(EventType.NONE);
    }    
 
    @Override
    public String toString() {
        return "NoEvent{}";
    }   
}