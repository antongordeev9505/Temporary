package com.example.authorization;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/example/authorization/AuthorizationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/component_manager/IHasComponent;", "Lcom/example/authorization/AuthorizationComponent;", "()V", "dog", "Lcom/example/core_module/IDog;", "getDog", "()Lcom/example/core_module/IDog;", "setDog", "(Lcom/example/core_module/IDog;)V", "getComponent", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "authorization_debug"})
public final class AuthorizationActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.component_manager.IHasComponent<com.example.authorization.AuthorizationComponent> {
    @javax.inject.Inject
    public com.example.core_module.IDog dog;
    
    public AuthorizationActivity() {
        super();
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
    public com.example.authorization.AuthorizationComponent getComponent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getComponentKey() {
        return null;
    }
}