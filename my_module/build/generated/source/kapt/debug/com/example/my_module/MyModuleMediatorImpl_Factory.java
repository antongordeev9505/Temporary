package com.example.my_module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MyModuleMediatorImpl_Factory implements Factory<MyModuleMediatorImpl> {
  @Override
  public MyModuleMediatorImpl get() {
    return newInstance();
  }

  public static MyModuleMediatorImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MyModuleMediatorImpl newInstance() {
    return new MyModuleMediatorImpl();
  }

  private static final class InstanceHolder {
    private static final MyModuleMediatorImpl_Factory INSTANCE = new MyModuleMediatorImpl_Factory();
  }
}
