import { useState } from 'react';  // ✅ useState 가져오기

function InputLogger() {
    const [text, setText] = useState("");  // ✅ 입력 값을 저장할 상태

    function handleChange(event) {
        setText(event.target.value);  // ✅ 입력값을 state에 저장
    }

    return (
        <div>
            <input type="text" onChange={handleChange} />  {/* ✅ 입력 이벤트 연결 */}
            <p>입력한 내용: {text}</p>  {/* ✅ 입력한 값이 실시간으로 반영됨 */}
        </div>
    );
}

export default InputLogger;