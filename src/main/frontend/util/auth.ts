import { configureAuth } from '@vaadin/hilla-react-auth';
import UserLogin  from 'Frontend/generated/com/app/manager/login/UserLogin';
import { LoginService } from 'Frontend/generated/endpoints';

// const auth = configureAuth(UserEndpoint.getAuthenticatedUser);
const auth = configureAuth(LoginService.doLogin);

export const useAuth = auth.useAuth;
export const AuthProvider = auth.AuthProvider;
