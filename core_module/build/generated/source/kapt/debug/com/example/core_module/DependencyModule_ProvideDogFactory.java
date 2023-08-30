package com.example.core_module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DependencyModule_ProvideDogFactory implements Factory<IDog> {
  private final DependencyModule module;

  public DependencyModule_ProvideDogFactory(DependencyModule module) {
    this.module = module;
  }

  @Override
  public IDog get() {
    return provideDog(module);
  }

  public static DependencyModule_ProvideDogFactory create(DependencyModule module) {
    return new DependencyModule_ProvideDogFactory(module);
  }

  public static IDog provideDog(DependencyModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDog());
  }
}
