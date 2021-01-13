package calendar.generator.logic;


// Class that enable a counter that loops across defined bounds
// this will increment/decrement internal state by one, but only inside bounds.


public class LoopCounter {

	
	// Internal State
	private int min = 0;
	private int max = 0;
	private int internal = 0;
	
	
	// Constructors
	LoopCounter(int min,int max, int internal)
	{
		this.min = min;
		this.max = max;
		this.internal = internal;
	}

	// getters and setters
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getInternal() {
		return internal;
	}

	public void setInternal(int internal) {
		this.internal = internal;
	}
	
	// methods
	public void increment()
	{
		int s = this.getInternal();
		
		if (s == this.getMax())
			this.setInternal(this.getMin());
		else
			this.setInternal(s+1);
	}
	
	
}