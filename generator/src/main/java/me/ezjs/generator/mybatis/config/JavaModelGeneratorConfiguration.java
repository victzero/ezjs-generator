/**
 * Copyright 2006-2016 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.ezjs.generator.mybatis.config;

import static me.ezjs.generator.mybatis.internal.util.messages.Messages.getString;

import java.util.List;

import me.ezjs.generator.mybatis.api.dom.xml.Attribute;
import me.ezjs.generator.mybatis.api.dom.xml.XmlElement;
import me.ezjs.generator.mybatis.internal.util.StringUtility;
import me.ezjs.generator.mybatis.internal.util.messages.Messages;

/**
 * @author Jeff Butler
 */
public class JavaModelGeneratorConfiguration extends PropertyHolder {

    private String targetPackage;

    private String targetProject;

    /**
     *
     */
    public JavaModelGeneratorConfiguration() {
        super();
    }

    public String getTargetProject() {
        return targetProject;
    }

    public void setTargetProject(String targetProject) {
        this.targetProject = targetProject;
    }

    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public XmlElement toXmlElement() {
        XmlElement answer = new XmlElement("javaModelGenerator"); //$NON-NLS-1$

        if (targetPackage != null) {
            answer.addAttribute(new Attribute("targetPackage", targetPackage)); //$NON-NLS-1$
        }

        if (targetProject != null) {
            answer.addAttribute(new Attribute("targetProject", targetProject)); //$NON-NLS-1$
        }

        addPropertyXmlElements(answer);

        return answer;
    }

    public void validate(List<String> errors, String contextId) {
        if (!StringUtility.stringHasValue(targetProject)) {
            errors.add(Messages.getString("ValidationError.0", contextId)); //$NON-NLS-1$
        }

        if (!StringUtility.stringHasValue(targetPackage)) {
            errors.add(Messages.getString("ValidationError.12", //$NON-NLS-1$
                    "JavaModelGenerator", contextId)); //$NON-NLS-1$
        }
    }
}
