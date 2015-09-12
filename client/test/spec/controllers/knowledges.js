'use strict';

describe('Controller: KnowledgesCtrl', function () {

  // load the controller's module
  beforeEach(module('clientApp'));

  var KnowledgesCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    KnowledgesCtrl = $controller('KnowledgesCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should knowledge is a added to the user', function () {
    expect(KnowledgesCtrl.user.knowledges).toBeDefined();
  });
});
