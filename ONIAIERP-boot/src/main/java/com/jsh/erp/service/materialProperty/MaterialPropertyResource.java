package com.jsh.erp.service.materialProperty;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author    2023-10-7 15:26:27
 */
@ResourceInfo(value = "materialProperty")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MaterialPropertyResource {
}
