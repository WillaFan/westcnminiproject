package com.fdmgroup.iwish.controller;

import com.fdmgroup.iwish.view.HomeView;
import org.springframework.web.bind.annotation.RestController;

@RestController("/index")
public class HomeController {

	private HomeView homeView;
	
	public HomeController() {
		super();
	}

	public HomeController(HomeView homeView) {
		super();
		this.homeView = homeView;
	}
	
	public void showHome() {
		homeView.showInitialOptions(false);
	}

	public HomeView getHomeView() {
		return homeView;
	}

	public void setHomeView(HomeView homeView) {
		this.homeView = homeView;
	}
}
