package edu.iis.mto.sourcetime;

public class FakeTimeSource implements TimeSource {
	
	private final int ONE_DAY = 24 * 60 * 60 * 1000;
	private final int ONE_HOUR = 60 * 60 * 1000;

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + ONE_DAY + ONE_HOUR;
	}
}
