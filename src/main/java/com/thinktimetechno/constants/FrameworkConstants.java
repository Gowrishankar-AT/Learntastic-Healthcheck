/*
 * Copyright (c) 2022 Anh Tester
 * Automation Framework Selenium
 */

package com.thinktimetechno.constants;

import com.thinktimetechno.helpers.Helpers;
import com.thinktimetechno.helpers.PropertiesHelpers;
import com.thinktimetechno.utils.ReportUtils;

import java.io.File;

public final class FrameworkConstants {

    private FrameworkConstants() {
    }

    static {
        PropertiesHelpers.loadAllFiles();
        System.out.println("Data From FrameworkConstants: " + PropertiesHelpers.getProperties());
    }

    public static final String PROJECT_PATH = Helpers.getCurrentDir();
    public static final String EXCEL_DATA_FILE_PATH = PropertiesHelpers.getValue("EXCEL_DATA_FILE_PATH");
    public static final String JSON_DATA_FILE_PATH = PropertiesHelpers.getValue("JSON_DATA_FILE_PATH");

    public static final String BROWSER = PropertiesHelpers.getValue("BROWSER");
    public static final String URL_CRM = PropertiesHelpers.getValue("URL_CRM");
    public static final String REMOTE_URL = PropertiesHelpers.getValue("REMOTE_URL");
    public static final String REMOTE_PORT = PropertiesHelpers.getValue("REMOTE_PORT");
    public static final String PROJECT_NAME = PropertiesHelpers.getValue("PROJECT_NAME");
    public static final String REPORT_TITLE = PropertiesHelpers.getValue("REPORT_TITLE");
    public static final String EXTENT_REPORT_NAME = PropertiesHelpers.getValue("EXTENT_REPORT_NAME");
    public static final String EXTENT_REPORT_FOLDER = PropertiesHelpers.getValue("EXTENT_REPORT_FOLDER");
    public static final String EXPORT_VIDEO_PATH = PropertiesHelpers.getValue("EXPORT_VIDEO_PATH");
    public static final String EXPORT_CAPTURE_PATH = PropertiesHelpers.getValue("EXPORT_CAPTURE_PATH");
    public static final String SEND_REPORT_TO_TELEGRAM = PropertiesHelpers.getValue("SEND_REPORT_TO_TELEGRAM");
    public static final String TELEGRAM_TOKEN = PropertiesHelpers.getValue("TELEGRAM_TOKEN");
    public static final String TELEGRAM_CHATID = PropertiesHelpers.getValue("TELEGRAM_CHATID");
    public static final String AUTHOR = PropertiesHelpers.getValue("AUTHOR");
    public static final String TARGET = PropertiesHelpers.getValue("TARGET");
    public static final String HEADLESS = PropertiesHelpers.getValue("HEADLESS");
    public static final String OVERRIDE_REPORTS = PropertiesHelpers.getValue("OVERRIDE_REPORTS");
    public static final String OPEN_REPORTS_AFTER_EXECUTION = PropertiesHelpers.getValue("OPEN_REPORTS_AFTER_EXECUTION");
    public static final String SEND_EMAIL_TO_USERS = PropertiesHelpers.getValue("SEND_EMAIL_TO_USERS");
    public static final String SCREENSHOT_PASSED_STEPS = PropertiesHelpers.getValue("SCREENSHOT_PASSED_STEPS");
    public static final String SCREENSHOT_FAILED_STEPS = PropertiesHelpers.getValue("SCREENSHOT_FAILED_STEPS");
    public static final String SCREENSHOT_SKIPPED_STEPS = PropertiesHelpers.getValue("SCREENSHOT_SKIPPED_STEPS");
    public static final String SCREENSHOT_ALL_STEPS = PropertiesHelpers.getValue("SCREENSHOT_ALL_STEPS");
    public static final String ZIP_FOLDER = PropertiesHelpers.getValue("ZIP_FOLDER");
    public static final String ZIP_FOLDER_PATH = PropertiesHelpers.getValue("ZIP_FOLDER_PATH");
    public static final String ZIP_FOLDER_NAME = PropertiesHelpers.getValue("ZIP_FOLDER_NAME");
    public static final String VIDEO_RECORD = PropertiesHelpers.getValue("VIDEO_RECORD");

    public static final String LOCATE = PropertiesHelpers.getValue("LOCATE");

    public static final int WAIT_DEFAULT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_DEFAULT"));
    public static final int WAIT_IMPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_IMPLICIT"));
    public static final int WAIT_EXPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_EXPLICIT"));
    public static final int WAIT_PAGE_LOADED = Integer.parseInt(PropertiesHelpers.getValue("WAIT_PAGE_LOADED"));
    public static final int WAIT_SLEEP_STEP = Integer.parseInt(PropertiesHelpers.getValue("WAIT_SLEEP_STEP"));
    public static final String ACTIVE_PAGE_LOADED = PropertiesHelpers.getValue("ACTIVE_PAGE_LOADED");

    public static final String EXTENT_REPORT_FOLDER_PATH = PROJECT_PATH + EXTENT_REPORT_FOLDER;
    public static final String EXTENT_REPORT_FILE_NAME = EXTENT_REPORT_NAME + ".html";
    public static String EXTENT_REPORT_FILE_PATH = EXTENT_REPORT_FOLDER_PATH + File.separator + EXTENT_REPORT_FILE_NAME;
    
    //LOCATORS
    
    public static final String LEARNTASTIC_PRODUCTION_URL = PropertiesHelpers.getValue("LEARNTASTIC_PRODUCTION_URL");
    public static final String HOMEPAGE_MODAL_CLOSE_BUTTON = PropertiesHelpers.getValue("HOMEPAGE_MODAL_CLOSE_BUTTON");
    public static final String HOMEPAGE_HELP_CENTER_LINK = PropertiesHelpers.getValue("HOMEPAGE_HELP_CENTER_LINK");
    public static final String STUDENT_LOGIN_BUTTON = PropertiesHelpers.getValue("STUDENT_LOGIN_BUTTON");
    public static final String ABOUT_BUTTON = PropertiesHelpers.getValue("ABOUT_BUTTON");
    public static final String GROUP_LOGIN_BUTTON = PropertiesHelpers.getValue("GROUP_LOGIN_BUTTON");
    public static final String FAQ_BUTTON = PropertiesHelpers.getValue("FAQ_BUTTON");
    public static final String VERIFY_CERTIFICATE_BUTTON = PropertiesHelpers.getValue("VERIFY_CERTIFICATE_BUTTON");
    public static final String REVIEWS_BUTTON = PropertiesHelpers.getValue("REVIEWS_BUTTON");
    public static final String BLOGS_BUTTON = PropertiesHelpers.getValue("BLOGS_BUTTON");
    public static final String PARTNERS_BUTTON = PropertiesHelpers.getValue("PARTNERS_BUTTON");
    public static final String CONTACT_US_BUTTON = PropertiesHelpers.getValue("CONTACT_US_BUTTON");
    public static final String PRIVACY_POLICY_BUTTON = PropertiesHelpers.getValue("PRIVACY_POLICY_BUTTON");
    public static final String REFUND_POLICY_BUTTON = PropertiesHelpers.getValue("REFUND_POLICY_BUTTON");
    public static final String TERMS_OF_USE_BUTTON = PropertiesHelpers.getValue("TERMS_OF_USE_BUTTON");
    public static final String CONSTRUCTION_BUTTON = PropertiesHelpers.getValue("CONSTRUCTION_BUTTON");
    public static final String HEALTHCARE_BUTTON = PropertiesHelpers.getValue("HEALTHCARE_BUTTON");
    public static final String ASSISTED_LIVING_BUTTON = PropertiesHelpers.getValue("ASSISTED_LIVING_BUTTON");
    public static final String THERAPY_BUTTON = PropertiesHelpers.getValue("THERAPY_BUTTON");
    public static final String EDUCATION_BUTTON = PropertiesHelpers.getValue("EDUCATION_BUTTON");
    public static final String GROUP_DISCOUNT_BUTTON = PropertiesHelpers.getValue("GROUP_DISCOUNT_BUTTON");
    public static final String LOGIN_BUTTON = PropertiesHelpers.getValue("LOGIN_BUTTON");
    public static final String PHYSICIANS_BUTTON = PropertiesHelpers.getValue("PHYSICIANS_BUTTON");
    public static final String PHARMACIST_BUTTON = PropertiesHelpers.getValue("PHARMACIST_BUTTON");
    public static final String REGISTERED_NURSE_BUTTON = PropertiesHelpers.getValue("REGISTERED_NURSE_BUTTON");
    public static final String NURSE_PRACTITIONER_BUTTON = PropertiesHelpers.getValue("NURSE_PRACTITIONER_BUTTON");
    public static final String ASSISTED_LIVING_FACILITY_MANAGER_BUTTON = PropertiesHelpers.getValue("ASSISTED_LIVING_FACILITY_MANAGER_BUTTON");
    public static final String ASSISTED_LIVING_NURSING_BUTTON = PropertiesHelpers.getValue("ASSISTED_LIVING_NURSING_BUTTON");
    public static final String CAREGIVERS_BUTTON = PropertiesHelpers.getValue("CAREGIVERS_BUTTON");
    public static final String ALF_TRAINING_BUTTON = PropertiesHelpers.getValue("ALF_TRAINING_BUTTON");
    public static final String ATHLETIC_TRAINERS_COURSE_BUTTON = PropertiesHelpers.getValue("ATHLETIC_TRAINERS_COURSE_BUTTON");
    public static final String MASSAGE_THERAPY_COURSE_BUTTON = PropertiesHelpers.getValue("MASSAGE_THERAPY_COURSE_BUTTON");
    public static final String OCCUPATIONAL_THERAPY_COURSE_BUTTON = PropertiesHelpers.getValue("OCCUPATIONAL_THERAPY_COURSE_BUTTON");
    public static final String PHYSICAL_THERAPY_COURSE_BUTTON = PropertiesHelpers.getValue("PHYSICAL_THERAPY_COURSE_BUTTON");
    public static final String JOIN_FOR_FREE_BUTTON = PropertiesHelpers.getValue("JOIN_FOR_FREE_BUTTON");
    public static final String CATEGORY_TITLE_OTHER = PropertiesHelpers.getValue("CATEGORY_TITLE_OTHER");
    public static final String LOGIN_PAGE_TITLE = PropertiesHelpers.getValue("LOGIN_PAGE_TITLE");
    public static final String GROUP_DISCOUNT_PAGE_TITLE = PropertiesHelpers.getValue("GROUP_DISCOUNT_PAGE_TITLE");

    
    
    
    
    
    public static final String ABOUT_PAGE_TITLE = PropertiesHelpers.getValue("ABOUT_PAGE_TITLE");
    public static final String PARTNERS_PAGE_TITLE = PropertiesHelpers.getValue("PARTNERS_PAGE_TITLE");
    public static final String REVIEWS_PAGE_TITLE = PropertiesHelpers.getValue("REVIEWS_PAGE_TITLE");
    public static final String BLOGS_PAGE_TITLE = PropertiesHelpers.getValue("BLOGS_PAGE_TITLE");
    public static final String VERIFY_CERTIFICATE_PAGE_TITLE = PropertiesHelpers.getValue("VERIFY_CERTIFICATE_PAGE_TITLE");
    public static final String STUDENT_LOGIN_PAGE_TITLE = PropertiesHelpers.getValue("STUDENT_LOGIN_PAGE_TITLE");
    public static final String FAQ_PAGE_TITLE = PropertiesHelpers.getValue("FAQ_PAGE_TITLE");
    public static final String CONTACT_US_PAGE_TITLE = PropertiesHelpers.getValue("CONTACT_US_PAGE_TITLE");
    public static final String PRIVACY_POLICY_PAGE_TITLE = PropertiesHelpers.getValue("PRIVACY_POLICY_PAGE_TITLE");
    public static final String REFUND_POLICY_PAGE_TITLE = PropertiesHelpers.getValue("REFUND_POLICY_PAGE_TITLE");
    public static final String GROUP_LOGIN_PAGE_TITLE = PropertiesHelpers.getValue("GROUP_LOGIN_PAGE_TITLE");
    public static final String TERMS_OF_USE_PAGE_TITLE = PropertiesHelpers.getValue("TERMS_OF_USE_PAGE_TITLE");
    
    
    public static final String PHYSICIANS_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("PHYSICIANS_COURSE_PAGE_TITLE");
    public static final String PHARMACIST_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("PHARMACIST_COURSE_PAGE_TITLE");
    public static final String REGISTERED_NURSE_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("REGISTERED_NURSE_COURSE_PAGE_TITLE");
    public static final String NURSE_PRACTITIONER_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("NURSE_PRACTITIONER_COURSE_PAGE_TITLE");
    public static final String ASSISTED_LIVING_FACILITY_MANAGER_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("ASSISTED_LIVING_FACILITY_MANAGER_COURSE_PAGE_TITLE");
    public static final String ASSISTED_LIVING_NURSING_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("ASSISTED_LIVING_NURSING_COURSE_PAGE_TITLE");
    public static final String CAREGIVERS_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("CAREGIVERS_COURSE_PAGE_TITLE");
    public static final String ALF_TRAINING_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("ALF_TRAINING_COURSE_PAGE_TITLE");
    public static final String ATHLETIC_TRAINERS_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("ATHLETIC_TRAINERS_COURSE_PAGE_TITLE");
    public static final String MASSAGE_THERAPY_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("MASSAGE_THERAPY_COURSE_PAGE_TITLE");
    public static final String OCCUPATIONAL_THERAPY_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("OCCUPATIONAL_THERAPY_COURSE_PAGE_TITLE");
    public static final String PHYSICAL_THERAPY_COURSE_PAGE_TITLE = PropertiesHelpers.getValue("PHYSICAL_THERAPY_COURSE_PAGE_TITLE");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    //Zip file for Report folder
    public static final String ZIPPED_EXTENT_REPORTS_FOLDER = EXTENT_REPORT_FOLDER + ".zip";

    public static final String YES = "yes";
    public static final String NO = "no";

    public static final String BOLD_START = "<b>";
    public static final String BOLD_END = "</b>";

    /* ICONS - START */

    public static final String ICON_SMILEY_PASS = "<i class='fa fa-smile-o' style='font-size:24px'></i>";
    public static final String ICON_SMILEY_SKIP = "<i class=\"fas fa-frown-open\"></i>";
    public static final String ICON_SMILEY_FAIL = "<i class='fa fa-frown-o' style='font-size:24px'></i>";

    public static final String ICON_OS_WINDOWS = "<i class='fa fa-windows' ></i>";
    public static final String ICON_OS_MAC = "<i class='fa fa-apple' ></i>";
    public static final String ICON_OS_LINUX = "<i class='fa fa-linux' ></i>";

    public static final String ICON_BROWSER_OPERA = "<i class=\"fa fa-opera\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_EDGE = "<i class=\"fa fa-edge\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_CHROME = "<i class=\"fa fa-chrome\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_FIREFOX = "<i class=\"fa fa-firefox\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_SAFARI = "<i class=\"fa fa-safari\" aria-hidden=\"true\"></i>";

    public static final String ICON_Navigate_Right = "<i class='fa fa-arrow-circle-right' ></i>";
    public static final String ICON_LAPTOP = "<i class='fa fa-laptop' style='font-size:18px'></i>";
    public static final String ICON_BUG = "<i class='fa fa-bug' ></i>";
    /* style="text-align:center;" */

    public static final String ICON_SOCIAL_GITHUB_PAGE_URL = "https://anhtester.com/";
    public static final String ICON_SOCIAL_LINKEDIN_URL = "https://www.linkedin.com/in/anhtester/";
    public static final String ICON_SOCIAL_GITHUB_URL = "https://github.com/anhtester";
    public static final String ICON_SOCIAL_LINKEDIN = "<a href='" + ICON_SOCIAL_LINKEDIN_URL
            + "'><i class='fa fa-linkedin-square' style='font-size:24px'></i></a>";
    public static final String ICON_SOCIAL_GITHUB = "<a href='" + ICON_SOCIAL_GITHUB_URL
            + "'><i class='fa fa-github-square' style='font-size:24px'></i></a>";

    public static final String ICON_CAMERA = "<i class=\"fa fa-camera\" aria-hidden=\"true\"></i>";

    public static final String ICON_BROWSER_PREFIX = "<i class=\"fa fa-";
    public static final String ICON_BROWSER_SUFFIX = "\" aria-hidden=\"true\"></i>";
    /* ICONS - END */

    public static String getExtentReportFilePath() {
//        if (EXTENT_REPORT_FILE_PATH.isEmpty()) {
            EXTENT_REPORT_FILE_PATH = ReportUtils.createExtentReportPath();
//        }
        return EXTENT_REPORT_FILE_PATH;
    }

}
