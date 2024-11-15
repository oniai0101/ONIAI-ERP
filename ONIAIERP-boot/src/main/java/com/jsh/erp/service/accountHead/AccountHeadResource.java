package com.jsh.erp.service.accountHead;

import com.jsh.erp.service.ResourceInfo;

import java.lang.annotation.*;

/**
 * 
 */
@ResourceInfo(value = "accountHead")
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AccountHeadResource {
}
