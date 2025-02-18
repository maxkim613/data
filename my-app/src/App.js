import React from "react";
import MyComponent from "./MyComponent";
import Welcome from "./Welcome";
import Greeting from "./Greeting";
import Toggle from "./Toggle";
import InputLogger from "./InputLogger";
const App = () => {
  return (
    <div>
      <h1>Hello, React!</h1>
      <MyComponent />
      <Welcome text="Welcome to React" />
      <Welcome text="Enjoy coding" />
      <Greeting name="Alice" />
      <Greeting name="Bob" />
      <Toggle />
      <InputLogger />
    </div>
  );
};

export default App;