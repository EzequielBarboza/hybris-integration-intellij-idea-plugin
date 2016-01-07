/*
 * This file is part of "hybris integration" plugin for Intellij IDEA.
 * Copyright (C) 2014-2015 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.intellij.idea.plugin.hybris.utils;

/**
 * Created 10:30 PM 07 June 2015
 *
 * @author Alexander Bartash <AlexanderBartash@gmail.com>
 */
public final class HybrisConstants {

    public static final String EXTENSION_INFO_XML = "extensioninfo.xml";
    public static final String LOCAL_EXTENSIONS_XML = "localextensions.xml";
    public static final String HYBRIS_SERVER_SHELL_SCRIPT_NAME = "bin/platform/hybrisserver.sh";
    public static final String CUSTOM_MODULES_DIRECTORY_RELATIVE_PATH = "bin/custom";
    public static final String EXTENSIONS_XML = "extensions.xml";
    public static final String NEW_IDEA_MODULE_FILE_EXTENSION = ".iml";
    public static final String OLD_IDEA_MODULE_FILE_EXTENSION = ".eml";
    public static final String PLATFORM_EXTENSION_NAME = "platform";
    public static final String PLATFORM_EXTENSIONS_DIRECTORY_NAME = "ext";
    public static final String CONFIG_EXTENSION_NAME = "config";
    public static final String CONFIG_RELATIVE_PATH = "/../../"+CONFIG_EXTENSION_NAME;
    public static final String LIB_DIRECTORY = "lib";
    public static final String BIN_DIRECTORY = "bin";
    public static final String RESOURCES_DIRECTORY = "resources";
    public static final String PROJECT_PROPERTIES = "project.properties";
    public static final String APPLICATION_CONTEXT_SPRING_FILES = "application-context";
    public static final String ADDITIONAL_WEB_SPRING_CONFIG_FILES = "additionalWebSpringConfigs";
    public static final String GLOBAL_CONTEXT_SPRING_FILES = "global-context";

    public static final String SRC_DIRECTORY = "src";
    public static final String GEN_SRC_DIRECTORY = "gensrc";
    public static final String TEST_SRC_DIRECTORY = "testsrc";
    public static final String HMC_MODULE_DIRECTORY = "hmc";
    public static final String WEB_MODULE_DIRECTORY = "web";
    public static final String BACK_OFFICE_MODULE_DIRECTORY = "backoffice";
    public static final String ADDON_SRC_DIRECTORY = "addonsrc";
    public static final String TEST_CLASSES_DIRECTORY = "testclasses";
    public static final String CLASSES_DIRECTORY = "classes";
    public static final String SETTINGS_DIRECTORY = ".settings";
    public static final String EXTERNAL_TOOL_BUILDERS_DIRECTORY = ".externalToolBuilders";
    public static final String WEB_ROOT_DIRECTORY = "webroot";
    public static final String WEB_INF_DIRECTORY = "WEB-INF";
    public static final String COMMON_WEB_SRC_DIRECTORY = "commonwebsrc";
    public static final String ECLIPSE_BIN_DIRECTORY = "eclipsebin";
    public static final String COMMON_WEB_MODULE_DIRECTORY = "commonweb";
    public static final String ACCELERATOR_ADDON_DIRECTORY = "acceleratoraddon";
    public static final String PLATFORM_BOOTSTRAP_DIRECTORY = "bootstrap";
    public static final String PLATFORM_MODEL_CLASSES_DIRECTORY = "modelclasses";
    public static final String PLATFORM_TOMCAT_DIRECTORY = "tomcat";
    public static final String PLATFORM_TOMCAT_WORK_DIRECTORY = "work";

    public static final String COMMON_LIBS_GROUP = "Common libs";

    public static final String WEB_INF_LIB_DIRECTORY = "web/webroot/WEB-INF/lib";
    public static final String WEB_INF_CLASSES_DIRECTORY = "web/webroot/WEB-INF/classes";
    public static final String WEB_SRC_DIRECTORY = "web/src";
    public static final String HMC_LIB_DIRECTORY = "hmc/bin";
    public static final String BACKOFFICE_LIB_DIRECTORY = "backoffice/bin";

    public static final String PL_BOOTSTRAP_LIB_DIRECTORY = "bootstrap/bin";
    public static final String PL_BOOTSTRAP_GEN_SRC_DIRECTORY = "bootstrap/gensrc";
    public static final String PL_TOMCAT_LIB_DIRECTORY = "tomcat/lib";
    public static final String PL_TOMCAT_BIN_DIRECTORY = "tomcat/bin";

    public static final String CONFIG_LICENCE_DIRECTORY = "licence";

    public static final String WEB_COMPILER_OUTPUT_PATH = WEB_INF_CLASSES_DIRECTORY;
    public static final String BACKOFFICE_COMPILER_OUTPUT_PATH = "/backoffice/classes";
    public static final String JAVA_COMPILER_OUTPUT_PATH = "/classes";
    public static final String COMPILER_OUTPUT_PATH = "/eclipsebin";

    public static final String HYBRIS_PROJECT_SETTINGS_FILE_NAME = "hybrisProjectSettings.xml";
    public static final String HYBRIS_INTEGRATION_SETTINGS_FILE_NAME = "hybrisIntegrationSettings.xml";

    public static final String DEFAULT_DIRECTORY_NAME_FOR_IDEA_MODULE_FILES = "idea-module-files";
    public static final String CONFIGURATOR_FACTORY_ID = "ccom.intellij.idea.plugin.hybris.impex.hybrisConfiguratorFactory";

    public static final int MAX_EXISTING_MODULE_NAMES = 20;

    private HybrisConstants() throws IllegalAccessException {
        throw new IllegalAccessException("Should never be accessed.");
    }
}
