package com.example.src_android.core.data.repo

import com.example.src_android.core.data.services.AboutApiServices
import javax.inject.Inject

class AboutRepo @Inject constructor(private val aboutApiServices: AboutApiServices) {
    suspend fun getOfficials() = aboutApiServices.getOfficials()
}


//# User API
//
//REACT_APP_SIGN_UP = https://src-website-api.onrender.com/api/v1/signup
//REACT_APP_LOGIN_IN = https://src-website-api.onrender.com/api/v1/login
//REACT_APP_FORGOT_PASSWORD = https://src-website-api.onrender.com/api/v1/forgot/password/
//# Require Auth Token
//REACT_APP_RESET_PASSWORD = https://src-website-api.onrender.com/api/v1/reset/password/
//#Require Auth
//REACT_APP_GET_USER_BY_EMAIL = https://src-website-api.onrender.com/api/v1/email/
//# Require Auth
//REACT_APP_UPDATE_ROLE_BY_EMAIL = https://src-website-api.onrender.com/api/v1/update/role/
//REACT_APP_UPDATE_USER_DETAILS = https://src-website-api.onrender.com/api/v1/update/details/
//# Officials API
//
//REACT_APP_CREATE_OFFICIAL = https://src-website-api.onrender.com/api/v1/officials
//REACT_APP_GET_OFFICIALS = https://src-website-api.onrender.com/api/v1/officials
//REACT_APP_GET_OFFICIAL_BY_ID = https://src-website-api.onrender.com/api/v1/officials/
//REACT_APP_GET_OFFICIAL_BY_EMAIL = https://src-website-api.onrender.com/api/v1/official/
//REACT_APP_UPDATE_OFFICIAL_BY_EMAILID = https://src-website-api.onrender.com/api/v1/officials/
//REACT_APP_DELETE_OFFICIAL_BY_ID = https://src-website-api.onrender.com/api/v1/officials/
//
//# Domain API
//
//# REQUIRE AUTH
//REACT_APP_CREATE_DOMAIN = https://src-website-api.onrender.com/api/v1/domain
//REACT_APP_GET_DOMAINS = https://src-website-api.onrender.com/api/v1/domains
//REACT_APP_GET_DOMAIN_BY_ID = https://src-website-api.onrender.com/api/v1/domain/
//# REQUIRE AUTH
//REACT_APP_UPDATE_DOMAIN_BY_ID = https://src-website-api.onrender.com/api/v1/domain/
//# REQUIRE AUTH
//REACT_APP_DELETE_DOMAIN_BY_ID = https://src-website-api.onrender.com/api/v1/domain/
//# REQUIRE AUTH
//
//# Resource API
//
//REACT_APP_CREATE_RESOURCE = https://src-website-api.onrender.com/api/v1/resource/
//REACT_APP_GET_RESOURCES = https://src-website-api.onrender.com/api/v1/resources
//REACT_APP_GET_RESOURCE_BY_ID = https://src-website-api.onrender.com/api/v1/resource/
//REACT_APP_GET_RESOURCE_BY_DOMAIN_ID = https://src-website-api.onrender.com/api/v1/resources/
//# REQUIRE AUTH
//REACT_APP_UPDATE_RESOURCE_BY_ID = https://src-website-api.onrender.com/api/v1/resource/
//# REQUIRE AUTH
//REACT_APP_DELETE_RESOURCE_BY_ID = https://src-website-api.onrender.com/api/v1/resource/
//
//# Contact Forum API
//
//REACT_APP_CONTACT_FORUM = https://src-website-api.onrender.com/api/v1/contact-forum
//REACT_APP_GET_CONTACT_FORUM = https://src-website-api.onrender.com/api/v1/contact-forums
//REACT_APP_GET_CONTACT_FORUM_BY_ID = https://src-website-api.onrender.com/api/v1/contact-forum/
//REACT_APP_GET_CONTACT_FORUM_BY_DOMAIN_ID  = https://src-website-api.onrender.com/api/v1/contact-forums/
//REACT_APP_UPDATE_CONTACT_FORUM = https://src-website-api.onrender.com/api/v1/contact-forum/
//REACT_APP_DELETE_CONTACT_FORUM = https://src-website-api.onrender.com/api/v1/contact-forum/
//
//# News API
//# Require AuthToken
//
//REACT_APP_GET_NEWS = https://src-website-api.onrender.com/api/v1/news
//REACT_APP_CREATE_NEWS = https://src-website-api.onrender.com/api/v1/create/news
//REACT_APP_UPDATE_NEWS  = https://src-website-api.onrender.com/api/v1/update/news/
//REACT_APP_DELETE_NEWS = https://src-website-api.onrender.com/api/v1/delete/news/
//
//# Project API
//# Require AuthToken
//
//REACT_APP_GET_ALL_PROJECTS = https://src-website-api.onrender.com/api/v1/projects
//REACT_APP_CREATE_PROJECT = https://src-website-api.onrender.com/api/v1/project
//REACT_APP_UPDATE_PROJECT = https://src-website-api.onrender.com/api/v1/project/
//REACT_APP_DELETE_PROJECT = https://src-website-api.onrender.com/api/v1/project/
//
//# User Profiles
//REACT_APP_GET_ALL_USER_PROFILES = https://src-website-api.onrender.com/api/v1/profiles
//REACT_APP_GET_USER_PROFILE_BY_EMAIL = https://src-website-api.onrender.com/api/v1/profiles/email/
//REACT_APP_UPDATE_USER_DETAILS_BY_ID_DONE_BY_USER = https://src-website-api.onrender.com/api/v1/profiles/update/
//
//
//# Events API
//
//REACT_APP_GET_EVENTS = https://src-website-api.onrender.com/api/v1/events
//REACT_APP_GET_EVENT_BY_ID = https://src-website-api.onrender.com/api/v1/events/
//REACT_APP_GET_DELETE_BY_ID = https://src-website-api.onrender.com/api/v1/events/
//REACT_APP_GET_UPDATE_BY_ID = https://src-website-api.onrender.com/api/v1/events/
//REACT_APP_ADD_EVENT = https://src-website-api.onrender.com/api/v1/events
//
//
//# Testimonials API
//
//REACT_APP_GET_ALL_TESTIMONIALS = https://src-website-api.onrender.com/api/v1/testimonials
//REACT_APP_ADD_TESTIMONIAL = https://src-website-api.onrender.com/api/v1/testimonials/create
//REACT_APP_UPDATE_TESTIMONIAL = https://src-website-api.onrender.com/api/v1/testimonials/update/
//REACT_APP_DELETE_TESTIMONIAL = https://src-website-api.onrender.com/api/v1/testimonials/delete/
//
//
//# Officials API
//REACT_APP_GET_ALL_OFFICIALS = https://src-website-api.onrender.com/api/v1/officials
//REACT_APP_GET_OFFICIAL_BY_ID = https://src-website-api.onrender.com/api/v1/officials/
//REACT_APP_GET_OFFICIAL_BY_EMAIL = https://src-website-api.onrender.com/api/v1/officials/
//REACT_APP_ADD_OFFICIAL = https://src-website-api.onrender.com/api/v1/officials
//REACT_APP_UPDATE_OFFICIAL = https://src-website-api.onrender.com/api/v1/officials/
//REACT_APP_DELETE_OFFICIAL = https://src-website-api.onrender.com/api/v1/officials/
//
//# Carousel API
//
//REACT_APP_GET_ALL_CAROUSEL = https://src-website-api.onrender.com/api/v1/carousel
//REACT_APP_ADD_CAROUSEL = https://src-website-api.onrender.com/api/v1/carousel
//REACT_APP_UPDATE_CAROUSEL = https://src-website-api.onrender.com/api/v1/carousel/
//REACT_APP_DELETE_CAROUSEL = https://src-website-api.onrender.com/api/v1/carousel/
//
//# Feedback API
//
//REACT_APP_ADD_FEEDBACK = https://src-website-api.onrender.com/api/v1/CR/feedback
//REACT_APP_GET_ALL_FEEDBACKS = https://src-website-api.onrender.com/api/v1/allFeedbacks
//REACT_APP_GET_FEEDBACK_BY_FILTER = https://src-website-api.onrender.com/api/v1/feedback
//REACT_APP_GET_FEEDBACK_COLLECTION_BY_FILTER = https://src-website-api.onrender.com/api/v1/feedbacks


