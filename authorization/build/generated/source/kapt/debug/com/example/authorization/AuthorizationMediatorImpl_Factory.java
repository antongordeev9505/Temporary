package com.example.authorization;

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
public final class AuthorizationMediatorImpl_Factory implements Factory<AuthorizationMediatorImpl> {
  @Override
  public AuthorizationMediatorImpl get() {
    return newInstance();
  }

  public static AuthorizationMediatorImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthorizationMediatorImpl newInstance() {
    return new AuthorizationMediatorImpl();
  }

  private static final class InstanceHolder {
    private static final AuthorizationMediatorImpl_Factory INSTANCE = new AuthorizationMediatorImpl_Factory();
  }
}
