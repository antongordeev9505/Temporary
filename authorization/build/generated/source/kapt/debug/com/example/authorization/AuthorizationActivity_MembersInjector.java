package com.example.authorization;

import com.example.core_module.IDog;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AuthorizationActivity_MembersInjector implements MembersInjector<AuthorizationActivity> {
  private final Provider<IDog> dogProvider;

  public AuthorizationActivity_MembersInjector(Provider<IDog> dogProvider) {
    this.dogProvider = dogProvider;
  }

  public static MembersInjector<AuthorizationActivity> create(Provider<IDog> dogProvider) {
    return new AuthorizationActivity_MembersInjector(dogProvider);
  }

  @Override
  public void injectMembers(AuthorizationActivity instance) {
    injectDog(instance, dogProvider.get());
  }

  @InjectedFieldSignature("com.example.authorization.AuthorizationActivity.dog")
  public static void injectDog(AuthorizationActivity instance, IDog dog) {
    instance.dog = dog;
  }
}
