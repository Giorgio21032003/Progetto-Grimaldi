import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StorageMap } from '@ngx-pwa/local-storage';
import { Subscription } from 'rxjs';
import { Utente } from 'src/model/utente';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  standalone: false,
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  userInitials: string = 'AC';
  userName: string = 'Giorgio Cappiello';
  storageSub!: Subscription;
  constructor(private router: Router, private storage: StorageMap) { }

  ngOnInit() {
    this.storageSub = this.storage.get('utente').subscribe((value: Utente) => {
      this.userName = value.username;
      this.userInitials = value.username.charAt(0).toUpperCase();
    });
  }

  logout() {
   this.storageSub = this.storage.delete('utente').subscribe(() => {
      this.router.navigate(['/login']);
    });

  }

  ngOnDestroy(): void {
    if (this.storageSub) {
      this.storageSub.unsubscribe();
    }
  }

}
