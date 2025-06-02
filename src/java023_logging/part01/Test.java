package java023_logging.part01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	private static final Logger Log = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		Log.trace("trace message"); // 상세한 정보를 표시
		Log.debug("debug message"); // 디버깅을 위한 정보를 표시
		Log.info("info message"); // 정보성 로그를 표시
		Log.warn("message"); // 시스템 에러의 원인이 될 수 있는 경고성 메시지를 표시
		Log.error("warnror message"); // 요청을 처리하는 중 오류가 발생한 경우 표시
	}
}
