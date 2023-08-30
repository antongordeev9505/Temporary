package com.example.authorization;

@dagger.Component(dependencies = {com.example.authorization.AuthorizationDeps.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/example/authorization/AuthorizationComponent;", "", "inject", "", "activity", "Lcom/example/authorization/AuthorizationActivity;", "Factory", "Initializer", "authorization_debug"})
public abstract interface AuthorizationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.example.authorization.AuthorizationActivity activity);
    
    @dagger.Component.Factory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/authorization/AuthorizationComponent$Factory;", "", "create", "Lcom/example/authorization/AuthorizationComponent;", "deps", "Lcom/example/authorization/AuthorizationDeps;", "authorization_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.authorization.AuthorizationComponent create(@org.jetbrains.annotations.NotNull
        com.example.authorization.AuthorizationDeps deps);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/authorization/AuthorizationComponent$Initializer;", "", "()V", "Companion", "authorization_debug"})
    public static final class Initializer {
        @org.jetbrains.annotations.NotNull
        public static final com.example.authorization.AuthorizationComponent.Initializer.Companion Companion = null;
        
        private Initializer() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/authorization/AuthorizationComponent$Initializer$Companion;", "", "()V", "init", "Lcom/example/authorization/AuthorizationComponent;", "authorization_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.authorization.AuthorizationComponent init() {
                return null;
            }
        }
    }
}