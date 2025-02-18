import { useState } from 'react';  // ✅ useState 가져오기

function Toggle() {
    const [isOn, setIsOn] = useState(false);  // ✅ 상태(state) 선언 (초기값: false)

    function toggleButton() {
        setIsOn(!isOn);  // ✅ 상태를 true <-> false 로 변경
    }

    return (
        <div>
            <p>{isOn ? "ON" : "OFF"}</p>  {/* ✅ 상태 값에 따라 ON/OFF 출력 */}
            <button onClick={toggleButton}>Toggle</button>  {/* ✅ 버튼 클릭 시 상태 변경 */}
        </div>
    );
}

export default Toggle;