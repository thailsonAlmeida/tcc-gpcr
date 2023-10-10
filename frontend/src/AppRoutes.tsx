import React from 'react';
import { BrowserRouter, Switch, Route } from "react-router-dom";
import Home from './pages/Home';
import Header from './components/Header';
import Managers from './pages/Managers';


const AppRoutes = () => (
    <BrowserRouter>
        <Header />
        <Switch> 
            <Route path='/' exact>
                <Home />
            </Route>
            
            <Route path='/managers' exact>
                <Managers />
            </Route>
        </Switch>
    </BrowserRouter>
);

export default AppRoutes;