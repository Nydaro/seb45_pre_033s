import React from "react";
import styled from "styled-components";
import Login from "../components/Login";

const BodyContainer = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100vw;
  height: 100vh;
  background-color: #43347d;
  background-image: url("/sof_main.png");
  background-repeat: no-repeat;
  background-size: auto 100%;
  background-position: center;
  min-height: 850px;
`;


export default function MainPage() {
    return (
        <BodyContainer>
            <Login/>
        </BodyContainer>
    )
}