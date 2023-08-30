package com.example.core_module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class Dog_Factory implements Factory<Dog> {
  private final Provider<String> nameProvider;

  public Dog_Factory(Provider<String> nameProvider) {
    this.nameProvider = nameProvider;
  }

  @Override
  public Dog get() {
    return newInstance(nameProvider.get());
  }

  public static Dog_Factory create(Provider<String> nameProvider) {
    return new Dog_Factory(nameProvider);
  }

  public static Dog newInstance(String name) {
    return new Dog(name);
  }
}
