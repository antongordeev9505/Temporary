package com.example.my_module;

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
public final class DaggerMyModuleComponent {
  private DaggerMyModuleComponent() {
  }

  public static MyModuleComponent.Factory factory() {
    return new Factory();
  }

  private static final class Factory implements MyModuleComponent.Factory {
    @Override
    public MyModuleComponent create(MyModuleDeps deps) {
      Preconditions.checkNotNull(deps);
      return new MyModuleComponentImpl(deps);
    }
  }

  private static final class MyModuleComponentImpl implements MyModuleComponent {
    private final MyModuleDeps myModuleDeps;

    private final MyModuleComponentImpl myModuleComponentImpl = this;

    private MyModuleComponentImpl(MyModuleDeps myModuleDepsParam) {
      this.myModuleDeps = myModuleDepsParam;

    }

    @Override
    public void inject(MainActivity2 activity) {
      injectMainActivity2(activity);
    }

    private MainActivity2 injectMainActivity2(MainActivity2 instance) {
      MainActivity2_MembersInjector.injectMediator(instance, Preconditions.checkNotNullFromComponent(myModuleDeps.getMediator()));
      MainActivity2_MembersInjector.injectDog(instance, Preconditions.checkNotNullFromComponent(myModuleDeps.getDog()));
      return instance;
    }
  }
}
