package com.jsh.erp.service.depot;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * @author    2023-10-7 15:26:27
 */
@ResourceInfo(value = "depot")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DepotResource {
}