import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from 'src/pages/home-page/home-page.component';
import { LoginPageComponent } from 'src/pages/login-page/login-page.component';


const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full',  data: { title: 'Grimaldi Group' } },
  { path: 'home', component: HomePageComponent,  data: { title: 'Grimaldi Group' } },
  { path: 'login', component: LoginPageComponent,  data: { title: 'Login' } },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
