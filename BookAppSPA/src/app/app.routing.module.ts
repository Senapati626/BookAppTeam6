import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule,Routes } from "@angular/router";
import { AuthGuard } from "./service/auth.guard";
import { LoginComponent } from "./login/login.component";
import { HomeComponent } from "./home/home.component";
import { RegistrationComponent } from "./registration/registration.component";
import { DashboardComponent } from "./dashboard/dashboard.component";
import { SearchComponent } from "./search/search.component";
import { AuthorsComponent } from "./authors/authors.component";
import { RecommendedComponent } from "./recommended/recommended.component";
import { FavouritesComponent } from "./favourites/favourites.component";
export const routes:Routes = [
    {path: '',component:HomeComponent},
    {path: 'login',component:LoginComponent},
    {path: 'register',component: RegistrationComponent},
    {path: 'dashboard',component:DashboardComponent,canActivate:[AuthGuard]},
    {path: 'search',component:SearchComponent,canActivate:[AuthGuard]},
    {path: 'authors',component:AuthorsComponent,canActivate:[AuthGuard]},
    {path: 'recommended',component:RecommendedComponent,canActivate:[AuthGuard]},
    {path: 'favourites',component:FavouritesComponent,canActivate:[AuthGuard]},
    {path: '**',component:HomeComponent}
]

@NgModule({
    imports: [CommonModule,RouterModule.forRoot(routes)],
    exports: [RouterModule],
    declarations: []
})

export class AppRoutingModule{}