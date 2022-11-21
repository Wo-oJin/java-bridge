/**
 * BridgeGame 클래스에서 InputView, OutputView 를 사용하지 않는다.
 */

package bridge;

//Controller
import bridge.View.BridgeView;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private final BridgeView bridgeView = new BridgeView();
    private int bridgeSize;

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move() {
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }

    /**
     * 사용자가 게임을 시작할 때, 게임 시작 문구 출력을 위한 메서드
     */
    public void printStartMessage() {
        System.out.println("다리 건너기 게임을 시작합니다.\n");
    }

    /**
     * 사용자가 다리 개수를 입력할 때 사용하는 메서드
     */
    public void enterNumberOfBridge() {
        this.bridgeSize = bridgeView.readBridgeSize();
    }
}
