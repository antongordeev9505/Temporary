package com.example.my_module;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/my_module/MainActivity2;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/component_manager/IHasComponent;", "Lcom/example/my_module/MyModuleComponent;", "()V", "dog", "Lcom/example/core_module/IDog;", "getDog", "()Lcom/example/core_module/IDog;", "setDog", "(Lcom/example/core_module/IDog;)V", "mediator", "Lcom/example/authorization_api/AuthorizationMediator;", "getMediator", "()Lcom/example/authorization_api/AuthorizationMediator;", "setMediator", "(Lcom/example/authorization_api/AuthorizationMediator;)V", "getComponent", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "my_module_debug"})
public final class MainActivity2 extends androidx.appcompat.app.AppCompatActivity implements com.example.component_manager.IHasComponent<com.example.my_module.MyModuleComponent> {
    @javax.inject.Inject
    public com.example.authorization_api.AuthorizationMediator mediator;
    @javax.inject.Inject
    public com.example.core_module.IDog dog;
    
    public MainActivity2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.authorization_api.AuthorizationMediator getMediator() {
        return null;
    }
    
    public final void setMediator(@org.jetbrains.annotations.NotNull
    com.example.authorization_api.AuthorizationMediator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.core_module.IDog getDog() {
        return null;
    }
    
    public final void setDog(@org.jetbrains.annotations.NotNull
    com.example.core_module.IDog p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.my_module.MyModuleComponent getComponent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getComponentKey() {
        return null;
    }
}