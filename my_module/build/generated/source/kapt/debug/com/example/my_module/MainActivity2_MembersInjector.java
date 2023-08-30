package com.example.my_module;

import com.example.authorization_api.AuthorizationMediator;
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
public final class MainActivity2_MembersInjector implements MembersInjector<MainActivity2> {
  private final Provider<AuthorizationMediator> mediatorProvider;

  private final Provider<IDog> dogProvider;

  public MainActivity2_MembersInjector(Provider<AuthorizationMediator> mediatorProvider,
      Provider<IDog> dogProvider) {
    this.mediatorProvider = mediatorProvider;
    this.dogProvider = dogProvider;
  }

  public static MembersInjector<MainActivity2> create(
      Provider<AuthorizationMediator> mediatorProvider, Provider<IDog> dogProvider) {
    return new MainActivity2_MembersInjector(mediatorProvider, dogProvider);
  }

  @Override
  public void injectMembers(MainActivity2 instance) {
    injectMediator(instance, mediatorProvider.get());
    injectDog(instance, dogProvider.get());
  }

  @InjectedFieldSignature("com.example.my_module.MainActivity2.mediator")
  public static void injectMediator(MainActivity2 instance, AuthorizationMediator mediator) {
    instance.mediator = mediator;
  }

  @InjectedFieldSignature("com.example.my_module.MainActivity2.dog")
  public static void injectDog(MainActivity2 instance, IDog dog) {
    instance.dog = dog;
  }
}
