package edu.iis.mto.sourcetime;

public class SystemTimeSource implements TimeSource {

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}
}
