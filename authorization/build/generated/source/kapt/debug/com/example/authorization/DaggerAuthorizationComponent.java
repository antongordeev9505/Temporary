package com.example.authorization;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

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
public final class DaggerAuthorizationComponent {
  private DaggerAuthorizationComponent() {
  }

  public static AuthorizationComponent.Factory factory() {
    return new Factory();
  }

  private static final class Factory implements AuthorizationComponent.Factory {
    @Override
    public AuthorizationComponent create(AuthorizationDeps deps) {
      Preconditions.checkNotNull(deps);
      return new AuthorizationComponentImpl(deps);
    }
  }

  private static final class AuthorizationComponentImpl implements AuthorizationComponent {
    private final AuthorizationDeps authorizationDeps;

    private final AuthorizationComponentImpl authorizationComponentImpl = this;

    private AuthorizationComponentImpl(AuthorizationDeps authorizationDepsParam) {
      this.authorizationDeps = authorizationDepsParam;

    }

    @Override
    public void inject(AuthorizationActivity activity) {
      injectAuthorizationActivity(activity);
    }

    private AuthorizationActivity injectAuthorizationActivity(AuthorizationActivity instance) {
      AuthorizationActivity_MembersInjector.injectDog(instance, Preconditions.checkNotNullFromComponent(authorizationDeps.getDog()));
      return instance;
    }
  }
}
