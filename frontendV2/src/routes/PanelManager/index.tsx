import { Outlet } from "react-router-dom";
import Header from "../../components/Header";

export default function PanelManager(){
    return(
        <>
            <Header />
            <Outlet />            
        </>
    );
}