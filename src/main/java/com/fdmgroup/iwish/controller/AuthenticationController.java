package com.fdmgroup.iwish.controller;

import com.fdmgroup.iwish.dao.IUserDao;
import com.fdmgroup.iwish.model.User;
import com.fdmgroup.iwish.model.UserSession;
import com.fdmgroup.iwish.view.DashboardView;
import com.fdmgroup.iwish.view.HomeView;

public class AuthenticationController {

	private DashboardView dashboardView;
	private HomeView homeView;
	private IUserDao userDao;
	
	public AuthenticationController() {
		super();
	}

	public AuthenticationController(DashboardView dashboardView, HomeView homeView, IUserDao userDao) {
		super();
		this.dashboardView = dashboardView;
		this.homeView = homeView;
		this.userDao = userDao;
	}

	public void login(String username, String password) {
		User user = userDao.findByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			UserSession.setLoggedInUser(user);
			dashboardView.showDashboard();
			return;
		}
		
		homeView.showLoginOptions(true);
	}

	public void logout() {
		UserSession.setLoggedInUser(null);
		homeView.showInitialOptions(true);
	}

	public DashboardView getDashboardView() {
		return dashboardView;
	}

	public void setDashboardView(DashboardView dashboardView) {
		this.dashboardView = dashboardView;
	}

	public HomeView getHomeView() {
		return homeView;
	}

	public void setHomeView(HomeView homeView) {
		this.homeView = homeView;
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
}



















