package lab5.Events;

import lab5.State.Customer;
import lab5.State.StateStore;
/**
 * EventClose shall be runned when the store is closed, this will prohibit further customers to ARRIVE.
 * @author samuelgraden
 *
 */
public class EventClose extends Event{
	private double time;
	
	public EventClose(StateStore state, EventQueue EventQueue) {
		this.time = state.getCurrentTime();
	}
	@Override
	public void run(StateStore state,EventQueue EventQueue) {
		super.run(state, EventQueue);
	}
	
	@Override
	public double getTime() {
		return this.time;
	}
}
